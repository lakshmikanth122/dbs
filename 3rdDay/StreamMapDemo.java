package com.capgemini.day3Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<Person> plist =new ArrayList<>();
		plist.add(new Person("Kanth", "kanth@kanth.com", 26, Gender.MALE));
		plist.add(new Person("KanthR", "kanthr@kanth.com", 26, Gender.FEMALE));
		plist.add(new Person("KanthJ", "kanthj@kanth.com", 25, Gender.FEMALE));
		plist.add(new Person("KanthK", "kanthk@kanth.com", 23, Gender.MALE));
		
		plist.stream().map(m->m.getEmail()).forEach(System.out::println);
		System.out.println("\n --------------\n");
		plist.stream().map(m->m.getName().toUpperCase()).forEach(System.out::println);
		System.out.println("\n --------------\n");
		plist.stream().mapToInt(m->m.getAge()).filter(p->(p >= 20)).forEach(System.out::println);
		System.out.println("\n --------------\n");
		plist.stream().map(m->m.getGender()).forEach(System.out::println);
		plist.spliterator();
		System.out.println(plist.toString());
		System.out.println("\n --------------\n");
		IntStream.range(1, 20).forEach(System.out::print);
		int sum=IntStream.range(2, 9).sum();
		System.out.println("\n --------------\n");
		System.out.println(sum+"Sum");
		System.out.println("\n --------------\n");
		IntStream.range(1, 12).skip(8).forEach((x)->System.out.println(x));
		System.out.println("\n --------------\n");
		Stream.of("Anti","Amte","Amtu").sorted().findFirst().ifPresent(System.out::println);
		String order[]= {"Anti","Amte","Amtu"};
		System.out.println("\n --------------\n");
		Stream.of("9","6","5").sorted().findFirst().ifPresent(System.out::println);
		System.out.println("\n --------------\n");
		Stream.of(order).sorted().findFirst().ifPresent(System.out::println);
		System.out.println("\n --------------\n");
		Stream.of(order).sorted().forEach(System.out::println);
		String []names= {"An","And" , "Kenley","Kanth","Karala","Server"};
		System.out.println("\n --------------\n");
		Stream.of(names).filter((x)->x.startsWith("K")).sorted().forEach(System.out::println);
		System.out.println("\n --------------\n");
		System.out.println(Stream.of(names).filter((x)->x.startsWith("K")).sorted().count());
		System.out.println("\n ------Avarage of squares of an int array--------\n");
		Arrays.stream(new int[] {2,4,5,7,8,10}).map(x -> x*x).average().ifPresent(System.out::println);
		Arrays.stream(new int[] {2,4,5,7,8,10}).average().ifPresent(System.out::println);
		System.out.println("\n --------------\n");
		List<String> peoples=Arrays.asList("antisdss","anHBFH","dknfFD","MNDM","aJDBSJSJj","mbsh");
		peoples.stream().map(x->x.toLowerCase()).filter(x->x.startsWith("a")).forEach(System.out::println);
		System.out.println("\n --------------\n");
		Stream<String> rows1=Files.lines(Paths.get("C:\\Users\\learning.DIN86000506\\Documents\\workspace-sts-3.9.2.RELEASE\\StringEX\\src\\com\\capgemini\\day3Java8\\data.txt"));
		int rCount=(int) rows1.map(x->x.split(",")).filter(x->x.length==3).count();
		System.out.println(rCount);
		System.out.println("\n --------------\n");
		Stream<String> rows2=Files.lines(Paths.get("C:\\Users\\learning.DIN86000506\\Documents\\workspace-sts-3.9.2.RELEASE\\StringEX\\src\\com\\capgemini\\day3Java8\\data.txt"));
		
		rows2.map(x->x.split(",")).filter(x->x.length==3).filter(x->Integer.parseInt(x[1])>15).forEach(x->System.out.println(x[0] +" "+x[1]+" "+x[2]));
		rows2.close();
		System.out.println("\n --------------\n");
		Stream<String> rows3=Files.lines(Paths.get("C:\\Users\\learning.DIN86000506\\Documents\\workspace-sts-3.9.2.RELEASE\\StringEX\\src\\com\\capgemini\\day3Java8\\data.txt"));
		Map<String ,Integer> map= new HashMap<>();
		
	map=rows3.map(x->x.split(",")).filter(x->x.length==3).filter(x->Integer.parseInt(x[1])>15).collect(Collectors.toMap(x->x[0], x->Integer.parseInt(x[1])));
	for(String key :map.keySet())
	{
		System.out.println(key+"   key  value "+map.get(key));
	}
		rows3.close();
		
		System.out.println(Stream.of(1.0,3.8,8.9).reduce(0.0,(Double a,Double b)->a+b));
		System.out.println(IntStream.of(1,3,4,5,6,7,8,9).summaryStatistics());
	
	}

}
