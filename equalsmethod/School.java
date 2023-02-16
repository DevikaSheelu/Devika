package equalsmethod;

public class School {
	String sch_name;
	char sch_grade;
	char sch_strength;
	School(String sch_name,char sch_grade,char sch_strength){
		this.sch_name=sch_name;
		this.sch_grade=sch_grade;  
		this.sch_strength=sch_strength;
	}
	public boolean equals(Object obj){
		School s2=(School)obj;
		return ((this.sch_grade==s2.sch_grade) && (this.sch_strength==s2.sch_strength));
		
	}
	public static void main(String[] args) {
		School s1=new School("H.K.E",'S','A');
		School s2=new School("MALLIKARJUN",'S','A');
		if(s1.equals(s2)){
			System.out.println("grade and strength are same");
		}
		else{
			System.out.println("grade and strenght are not same");
		}
		
	}
	

}
