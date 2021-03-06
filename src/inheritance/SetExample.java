package inheritance;

import java.util.TreeSet;

public class SetExample {
	  public static void main(String[] args) {
	    TreeSet<String> names = new TreeSet<String>();
	    
	    // 객체 추가(기본적으로 nature ordering를 지원)
	    names.add("Daniel");
	    names.add("Brian");
	    names.add("Eugene");
	    names.add("Adam");
	    names.add("Cate");
	    
	    // 정보 출력
	    System.out.printf("names.size() -> %d\n", names.size());
	    System.out.printf("names.first() -> %s\n", names.first());
	    System.out.printf("names.last() -> %s\n", names.last());
	    
	    // Set의 모든 요소 출력
	    System.out.println("== for each 구문 출력 ==");
	    for (String str : names) {
	      System.out.println(str);
	    }
	  }
	}