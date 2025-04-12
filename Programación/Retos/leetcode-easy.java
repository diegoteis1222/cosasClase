package Retos;

import java.util.HashMap;

class Solution {

    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * You can return the answer in any order.
     * 
     * @param nums   array de numeros
     * @param target numero que queremos sumando dos numeros del array
     * @return los dos numeros que sumados dan el target
     * @see https://leetcode.com/problems/two-sum/description/
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                    return new int[] { i, j }; // Buena forma de devolver
            }
        }
        return new int[] {};
    }

    /**
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     * 
     * @param x el numero dado
     * @return true si es palindromo, false si no lo es
     * @see https://leetcode.com/problems/palindrome-number/description/
     */
    public boolean isPalindrome(int x) {

        StringBuilder num = new StringBuilder(String.valueOf(x));
        String reversed = num.reverse().toString();
        return String.valueOf(x).equals(reversed);

    }

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
     * and M.
     * 
     * Symbol Value
     * I 1
     * V 5
     * X 10
     * L 50
     * C 100
     * D 500
     * M 1000
     * For example, 2 is written as II in Roman numeral, just two ones added
     * together. 12 is written as XII, which is simply X + II. The number 27 is
     * written as XXVII, which is XX + V + II.
     * 
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number four is
     * written as IV. Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There
     * are six instances where subtraction is used:
     * 
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     * 
     * @param s numeros romanos dados
     * @return el valor sumado de los numeros romanos
     * @see https://leetcode.com/problems/roman-to-integer/description/
     */
    public int romanToInt(String s) {

        int total = 0;
        int previo = 0;
        int actual;

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            actual = roman.get(s.charAt(i));
            if (actual < previo) {
                total -= actual;
            } else {
                total += actual;
            }
            previo = actual;
        }
        return total;

    }

    /**
     * Given an integer array nums and an integer val, remove all occurrences of val
     * in nums in-place. The order of the elements may be changed. Then return the
     * number of elements in nums which are not equal to val.
     * 
     * Consider the number of elements in nums which are not equal to val be k, to
     * get accepted, you need to do the following things:
     * 
     * Change the array nums such that the first k elements of nums contain the
     * elements which are not equal to val. The remaining elements of nums are not
     * important as well as the size of nums.
     * Return k.
     * 
     * @param nums Array de numeros dado
     * @param val  valor a eliminar
     * @return la cantidad de veces eliminado el numero
     */
    public static int removeElement(int[] nums, int val) {
        int cont = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[cont] = nums[i];
                cont++;
            }
        }
        return cont;
    }

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the
     * duplicates in-place such that each unique element appears only once. The
     * relative order of the elements should be kept the same. Then return the
     * number of unique elements in nums.
     * 
     * Consider the number of unique elements of nums to be k, to get accepted, you
     * need to do the following things:
     * 
     * Change the array nums such that the first k elements of nums contain the
     * unique elements in the order they were present in nums initially. The
     * remaining elements of nums are not important as well as the size of nums.
     * Return k.
     * 
     * @param nums array de numeros dado
     * @return la cantidad de elementos unicos, elimina los duplicados de un array
     * @see https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
     */
    public static int removeDuplicates(int[] nums) {
        int cont = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[cont - 1]) {
                nums[cont] = nums[i];
                cont++;
            }
        }
        return cont;
    }

}