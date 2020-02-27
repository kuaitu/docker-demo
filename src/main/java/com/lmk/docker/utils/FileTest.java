package com.lmk.docker.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.*;
import java.util.regex.Pattern;

public class FileTest {
    // static File file = new File("D:\\Java");

    public static void main(String[] args) {
        /*String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }*/
        /*File file = new File(".");
        String[] list = file.list();
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new DirFilter(args[0]));
            Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        }
        for (String s : list) {
            System.out.println(s);
        }*/

        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        set.iterator();
        arrayList.iterator();

    }

    static class DirFilter implements FilenameFilter{
        private Pattern pattern;
        public DirFilter(String regex){
            pattern = Pattern.compile(regex);
        }

        @Override
        public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }
}
