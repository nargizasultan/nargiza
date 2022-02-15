package peaksoft;

public class Main {

    public static void main(String[] args) {
	Cow cow=new Cow(100, (byte)2, 'f', "Mumu");
	Cow cow1=new Cow(90, (byte)2, 'm', "Lolo");
	Cow cow2=new Cow(70, (byte)5, 'm', "Mik");
	Cow cow3=new Cow(80, (byte)4, 'f', "Hok");
	Cow cow4=new Cow(350, (byte)3, 'f', "Mara");
	Cow cow5=new Cow(350, (byte)1, 'f', "Mora");

	Sheep sheep=new Sheep(50, (byte)2, 'f', "Gosha");
	Sheep sheep1=new Sheep(60, (byte)1, 'm', "Tosha");
	Sheep sheep2=new Sheep(70, (byte)3, 'f', "Nosha");
	Sheep sheep3=new Sheep(80, (byte)4, 'm', "Mosha");
	Sheep sheep4=new Sheep(90, (byte)5, 'f', "Bosha");


	Horse horse=new Horse(200, (byte)1, 'f', "Misha", "Black");
	Horse horse1=new Horse(300, (byte)1, 'f', "Lena", "Green");
	Horse horse2=new Horse(150, (byte)1, 'm', "Moro", "Blue");

	Farm farm1=new Farm("Osh", new Cow[]{cow, cow1, cow2, cow3, cow4}, new Sheep[]{sheep1, sheep, sheep2}, new Horse[]{horse, horse1},"Nargiza" );
	Farm farm2=new Farm("Naryn", new Cow[]{cow5}, new Sheep[]{ sheep4}, new Horse[]{ horse2},"Nargiza" );

		System.out.println(farm1);
		System.out.println(farm2);



    }
}
