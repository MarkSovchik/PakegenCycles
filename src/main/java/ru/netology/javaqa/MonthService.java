package ru.netology.javaqa;

public class MonthService {
           public int calculate (int income, int expense, int threshold) {

            int money = 0;
            int count = 0;

            for (int i = 0; i < 12; i++) {
                if (money >= threshold) {
                    count++;
                    money = (money - expense) / 3;
                } else {
                    money = money + income - expense;
                }
            }
            return count;
         }
}

