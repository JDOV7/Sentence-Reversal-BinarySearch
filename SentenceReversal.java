/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SentenceReversal {

    public void SentenceReversal() {
        String[] sentence = {"h", "i", " ", "w", "o", "r", "l", "d", " ", "g", "o", "o", "d", " ", "w", "o", "r", "d"};
        ArrayList<String> aLists = new ArrayList(Arrays.asList(sentence));
        ArrayList<String> aReturn = new ArrayList();
        int iSearch = aLists.lastIndexOf(" ");
        while (iSearch != -1) {
            aReturn.addAll(aLists.subList(iSearch + 1, aLists.size()));
            aLists = new ArrayList(aLists.subList(0, iSearch));
            aReturn.add(" ");
            iSearch = aLists.lastIndexOf(" ");
        }
        if (aLists.size() != 0) {
            aReturn.addAll(aLists.subList(0, aLists.size()));
        }
//        String sResult[] = new String[aReturn.size()];
//        return sResult = aReturn.toArray(sResult);
    }
}
