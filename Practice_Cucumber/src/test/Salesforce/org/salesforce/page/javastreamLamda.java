package org.salesforce.page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javastreamLamda {

    public static void main( String[] args ) {

        stream();
        StreamMap();
        Collector();
    }

    public static void stream()
    {
        ArrayList<String> name=new ArrayList<String>();
        name.add("Ajay");
        name.add("Raj");
        name.add("mani");
        name.add("sanjay");
        name.add("uma");

       Long c= name.stream().filter(s->s.startsWith("R")).count();
        System.out.println(c);
       Stream.of("Nama","cama","jjj","hhad","kadg").filter(s ->s.length()>3).forEach(s->System.out.println(s));


    }

    public static void StreamMap()
    {
List<String>names= Arrays.asList("alekshya","ram","kumar","raja","manikam");
names.stream().filter(s -> s.contains("a")).map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
String a[]={"kojo","Hari","Rakes","JJ"};
List<String>names2= Arrays.asList(a);
names2.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
Stream<String> newstream=Stream.concat(names.stream(),names2.stream());
boolean flag=newstream.anyMatch(s -> s.equalsIgnoreCase("jjj"));
        System.out.println(flag);

    }

    public static void Collector()
    {
       List<String> colle= Stream.of("jjj","kkk","kkklll","kjsada").filter(s -> s.contains("s"))
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(colle);

        List<Integer> num=Stream.of(1,2,3,4,5,6,7,7,6,6,546,54,9,3).collect(Collectors.toList());
        num.stream().distinct().forEach(s-> System.out.println(s));
        num.stream().sorted().forEach(s-> System.out.println(s));








    }
}
