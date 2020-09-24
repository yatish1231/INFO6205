/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.randomwalk;

import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.;

public class RandomWalk {

	private int x = 0;
	private int y = 0;

	private final Random random = new Random();

	/**
	 * Private method to move the current position, that's to say the drunkard moves
	 *
	 * @param dx the distance he moves in the x direction
	 * @param dy the distance he moves in the y direction
	 */
	private void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
		// TO BE IMPLEMENTED
	}

	/**
	 * Perform a random walk of m steps
	 *
	 * @param m the number of steps the drunkard takes
	 */
	private void randomWalk(int m) {
		// TO BE IMPLEMENTED
		for (int i = 0; i < m; i++) {
			randomMove();
		}
	}

	/**
	 * Private method to generate a random move according to the rules of the
	 * situation. That's to say, moves can be (+-1, 0) or (0, +-1).
	 */
	private void randomMove() {
		boolean ns = random.nextBoolean();
		int step = random.nextBoolean() ? 1 : -1;
		move(ns ? step : 0, ns ? 0 : step);
	}

	/**
	 * Method to compute the distance from the origin (the lamp-post where the
	 * drunkard starts) to his current position.
	 *
	 * @return the (Euclidean) distance from the origin to the current position.
	 */
	public double distance() {
		// TO BE IMPLEMENTED
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}

	/**
	 * Perform multiple random walk experiments, returning the mean distance.
	 *
	 * @param m the number of steps for each experiment
	 * @param n the number of experiments to run
	 * @return the mean distance
	 */
	public static double randomWalkMulti(int m, int n) {
		double totalDistance = 0;
		for (int i = 0; i < n; i++) {
			RandomWalk walk = new RandomWalk();
			walk.randomWalk(m);
			totalDistance = totalDistance + walk.distance();
		}
		return totalDistance / n;
	}

	public static void main(String[] args) {
//        if (args.length == 0)
//            throw new RuntimeException("Syntax: RandomWalk steps [experiments]");
//        int m = Integer.parseInt(args[0]);
//        int n = 1000000;
//        if (args.length > 1) n = Integer.parseInt(args[1]);
		int count = 0;
		double final_avg_coeff = 0;
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		for (int n = 100; n <= 100000; n = n * 10) {
			Double[][] obj = new Double[101][2];
			double sum_coeff = 0;
			System.out.println("----------------------- " + "n = " + n + " ---------------------------");
			for (int m = 1; m < 101; m++) {
				double meanDistance = randomWalkMulti(m, n);
				double nlogn = Math.sqrt(m);
				double coeff = meanDistance/nlogn;
				sum_coeff = sum_coeff + coeff;
				obj[m][0] = Double.valueOf(String.valueOf(m));
				obj[m][1] = (Double) meanDistance;
				System.out.println(
						m + " steps: " + meanDistance + " over " + n + " experiments" + " root m value " + nlogn + " coefficient - " + coeff);
			}
			exportExcel(obj, count++, workbook);
			System.out.println("Average Coefficient - " + sum_coeff/100);
			final_avg_coeff = final_avg_coeff + sum_coeff/100;
//			count++;
			System.out.println("------------------------------------------------------------------");
		}
		System.out.println("Final Average Coefficient - " + final_avg_coeff/count);
//		try (FileOutputStream outputStream = new FileOutputStream("C:\\Algorithms-Fall2020\\RandomWalkExpNew.xlsx")) {
//			workbook.write(outputStream);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static void exportExcel(Object[][] bookData, int sheet_no, XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.createSheet("sheet no. " + sheet_no);

		int rowCount = 0;

		for (Object[] aBook : bookData) {
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;

			for (Object field : aBook) {
				Cell cell = row.createCell(++columnCount);
				if (field instanceof Double) {
					cell.setCellValue((Double) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}

		}

	}

}
