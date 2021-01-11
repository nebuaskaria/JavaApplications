package com.learning.main;

import com.learning.streams.StreamCollection;

public class MainClass {
    public static void main(String[]args){


        /*
        //  ------ String Manipulation Questions  ------
        StringQuestions stringQuestions = new StringQuestions();
        stringQuestions.reverseWords("Nebu Loves Molu".toCharArray());
        stringQuestions.testingReverse("Nebu Loves Molu".toCharArray());
        */

        /*
        //  ------ Array Questions  ------
        ArrayQuestions arrayQuestions = new ArrayQuestions();
        arrayQuestions.removeDuplicates(new int[]{1,2,2,2,3,4,4,5,5,5,6});
        */


        /*
        // ------ Wild Card feature ------
        Building testBuilding = new Building("BUILDING");
        testBuilding.testingWildCard();
        */

        /*
        // ------ Functional Interface  ------
        FirstFunctionalInterface functionalInterface = ()-> System.out.println("Functional Interface");
        functionalInterface.printFunctionalInterfaceName();
        */


        // ------ Stream - Collection ------
        StreamCollection streamCollection = new StreamCollection();
        streamCollection.testStreamInCollection();

        /*
        // ------ Matrix Questions  ------
        MatrixQuestions matrixQuestions = new MatrixQuestions();
        //matrixQuestions.setMatrixZero();
        matrixQuestions.searchMatrix();
        */
    }
}
