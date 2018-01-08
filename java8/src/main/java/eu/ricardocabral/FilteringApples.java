package eu.ricardocabral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {

	public static void main(String[] args) {
		   List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                   new Apple(155, "green"),
                   new Apple(120, "red"));	
		   
		   List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		   
		List<Apple> redApples = filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
		System.out.println(redApples);
		
		List<Integer> evenNumbers = filter(numbers, (Integer i) -> i %2 == 0);
		System.out.println(evenNumbers);
	}
	public static List<Apple> filterGreenApples(List<Apple> inventory, ApplePredicate predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory){
			if(predicate.test(apple)){
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for (T e: list){
			if(p.test(e)){
				result.add(e);
			}
		}
		return result;
	}
	
	public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" +
                   "color='" + color + '\'' +
                   ", weight=" + weight +
                   '}';
        }
    }

}
