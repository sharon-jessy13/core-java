package com.xworkzz.library.Product;

public class Board {

    public int boardId;
    public String boardType;
    public String brand;
    public double price;
    public String color;

    @Override
    public boolean equals(Object obj) {

        Board board = (Board) obj;

        if (this.boardId == board.boardId
                && this.boardType.equals(board.boardType)
                && this.brand.equals(board.brand)
                && this.price == board.price
                && this.color.equals(board.color)) {

            return true;
        }

        return false;
    }
}
