import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestForToday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> ls=new ArrayList<Integer>();
ls.add(5);
ls.add(2);
ls.add(4);
ls.add(1);
ls.add(2);
List<Integer> ls1=ls.stream().distinct().collect(Collectors.toList());
	System.out.println(ls1);
	ls.stream().filter(s->s.equals(5)).forEach(s->System.out.println(s));
	Stream.of("Neha","Rekha","Parteek","Tina").filter(s->s.equalsIgnoreCase("Rekha")).forEach(s->System.out.println(s));
	//names.stream().filter(s->s.equalsIgnoreCase("Amy")).forEach(s->System.out.println(s+" is printed"));

	}

}
