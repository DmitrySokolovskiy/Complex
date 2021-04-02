package by.htp.lesson10.presentation;

import by.htp.lesson10.entity.Complex;

public class ComplexView {
    public void printSumm(Complex compl1, Complex compl2, Complex compl3) {
        System.out.println("Сумма комлексных чисел: " + compl1.getMaterial() + "+" + compl1.getImaginary() + "i и " +
                compl2.getMaterial() + "+" + compl2.getImaginary() + "i = " + compl3.getMaterial() + " + " + compl1.getImaginary() + "i");
    }

    public void printMinus(Complex compl1, Complex compl2, Complex compl3) {
        System.out.println("Разница комлексных чисел: " + compl1.getMaterial() + "-" + compl1.getImaginary() + "i и " +
                compl2.getMaterial() + "-" + compl2.getImaginary() + "i = " + compl3.getMaterial() + " - " + compl1.getImaginary() + "i");
    }
}
