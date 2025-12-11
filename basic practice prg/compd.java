class compd{

public static void main(String[] args){

double principle = Double.parseDouble(args[0]);
double rate = Double.parseDouble(args[1]);
double time = Double.parseDouble(args[2]);
double num = Double.parseDouble(args[3]);

double ci =  principle * Math.pow((1 + (rate/num)), (num * time));

System.out.println("the compound intrest is:"+ci);
}
}

