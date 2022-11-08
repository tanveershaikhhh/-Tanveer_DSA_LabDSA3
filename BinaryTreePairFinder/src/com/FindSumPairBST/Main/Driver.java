
package com.FindSumPairBST.Main;

import com.FindSumPairBST.Model.*;
import com.FindSumPairBST.Model.FindSumPairUsingBST.Node;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	FindSumPairUsingBST findSumPair = new FindSumPairUsingBST();
	Node root = null;
	root = findSumPair.insert(root, 20);
	root = findSumPair.insert(root, 40);
	root = findSumPair.insert(root, 50);
	root = findSumPair.insert(root, 70);
	root = findSumPair.insert(root, 60);
	root = findSumPair.insert(root, 30);
	int sum = 130;
	findSumPair.findPairWithGivenSum(root, sum);
	}

}