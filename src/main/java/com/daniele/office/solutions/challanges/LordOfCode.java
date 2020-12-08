package com.daniele.office.solutions.challanges;

import java.util.*;
import java.util.stream.Collectors;

public class LordOfCode {

    public static List<Integer> sortIntersect(List<Integer> volcanic, List<Integer> nonVolcanic) {
        // Write your code here
        List<Integer> result = new LinkedList<>();
        Map<Integer, Long> volcanicMap = volcanic.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        nonVolcanic.forEach(key -> {
            if (volcanicMap.containsKey(key)) {
                result.add(key);
                if (volcanicMap.get(key) > 1) {
                    volcanicMap.merge(key, -1L, Long::sum);
                } else {
                    volcanicMap.remove(key);
                }

            }
        });
        result.sort(Collections.reverseOrder());
        return result;
    }

    public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {
        // Write your code here

        //sets all the possible moves
        List<Cell> possibleMoves = Arrays.asList(
                new Cell(-2, -1),
                new Cell(-1, -2),
                new Cell(1, -2),
                new Cell(2, -1),
                new Cell(-2, 1),
                new Cell(-1, 2),
                new Cell(1, 2),
                new Cell(2, 1)
        );
        //queue of cell to visit
        Vector<Cell> cells = new Vector<>();
        // add starting position to the queue
        cells.add(new Cell(startRow, startCol, 0));
        //store cells already visited
        Set<Map.Entry<Integer,Integer>> visited = new HashSet<>();

        // loop until we have one element in queue
        while (!cells.isEmpty()) {
            Cell cell = cells.firstElement();
            cells.remove(0);

            // if current cell is equal to target cell,
            // return its distance
            if (cell.x == endRow && cell.y == endCol)
                return cell.distance;

            // loop for all reachable states
            possibleMoves.forEach(move -> {
                Cell nextCell = Cell.sumCells(cell, move);
                Map.Entry<Integer,Integer> coordinates = new AbstractMap.SimpleEntry<>(nextCell.x, nextCell.y);
                // If reachable state is not yet visited and
                // inside board, push that state into queue
                if (isInBoard(nextCell, n) && !visited.contains(coordinates)) {
                    visited.add(coordinates);
                    nextCell.distance = cell.distance + 1;
                    cells.add(nextCell);
                }
            });
        }
        return -1;
    }

    static class Cell {
        int x, y;
        int distance;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Cell(int x, int y, int distance) {
            this.distance = distance;
            this.x=x;
            this.y=y;
        }

        static Cell sumCells(Cell c1, Cell c2) {
            return new Cell(c1.x+c2.x,c1.y+c2.y);
        }
    }

    //check if new position cell is in the board
    static boolean isInBoard(Cell cell, int n) {
        return cell.x >= 0 && cell.x < n && cell.y >= 0 && cell.y < n;
    }

    // Method returns minimum step
    // to reach target position
    static int minStepToReachTarget(int n, int startRow, int startCol, int endRow, int endCol) {

        //sets all the possible moves
        int[] movesX = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] movesY = {-1, -2, -2, -1, 1, 2, 2, 1};

        Vector<Cell> cells = new Vector<>();
        // add starting position to the queue
        cells.add(new Cell(startRow, startCol, 0));

        Cell cell;
        boolean[][] visited = new boolean[n][n]; //default boolean value is false
        visited[startRow][startCol] = true;

        // loop until we have one element in queue
        while (!cells.isEmpty()) {
            cell = cells.firstElement();
            cells.remove(0);

            // if current cell is equal to target cell,
            // return its distance
            if (cell.x == endRow && cell.y == endCol)
                return cell.distance;

            // loop for all reachable states
            for (int i = 0; i < 8; i++) {
                Cell nextCell = new Cell(cell.x + movesX[i],cell.y + movesY[i]);

                // If reachable state is not yet visited and
                // inside board, push that state into queue
                if (isInBoard(nextCell, n) && !visited[nextCell.x][nextCell.y]) {
                    visited[nextCell.x][nextCell.y] = true;
                    nextCell.distance = cell.distance + 1;
                    cells.add(nextCell);
                }
            }
        }
        return -1;
    }

}
