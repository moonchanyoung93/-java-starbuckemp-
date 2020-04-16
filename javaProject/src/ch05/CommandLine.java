package ch05;

public class CommandLine {

	public static void main(String[] args) {
		if(args.length>0) {//들어오는 데이터가 있다면
			for(int i =0;i<args.length;i++)
				System.out.print(" "+args[i]);

			if(args[0].contentEquals("-h"))
				System.out.print("HELP ");
			
		}

	}

}
