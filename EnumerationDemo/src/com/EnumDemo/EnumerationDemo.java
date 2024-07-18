package com.EnumDemo;

enum Shape
{
	Circle,
	Triangle,
	Rectangle
}

enum Days
{
	Monday,
	Tuseday,
	Wednesday,
	Thursday,
	Friday,
	Saturday,
	Sunday
}

enum Direction
{
	North,
	South,
	East,
	West
}

public class EnumerationDemo {

	public static void main(String[] args) {
		
//		Direction dil1 = Direction.North;
//		Direction dil2 = Direction.South;
//		
//		System.out.println("First direction: " +dil1);
//		System.out.println("First direction: " +dil2);

//		for(Direction dir : Direction.values())
//		{
//			System.out.println(dir);
//		}
		
		Direction dir = Direction.North;
		if(dir == Direction.East)
			System.out.println("Direction: East");
		
		else if(dir == Direction.West)
		{
			System.out.println("Direction: West");
		}
		
		else if(dir == Direction.North)
		{
			System.out.println("Direction: North");
		}
		
		else if(dir == Direction.South)
		{
			System.out.println("Direction: South");
		}
	}

}
