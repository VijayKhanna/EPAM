
package epamtask4;

public class Epamtask4 
{
	public double cost(String std_materaials,String automated_home,double sqr_feet)
	{
		double construction_cost = 0;
		if(std_materials=="use"&&automated_home=="No")
		{
			construction_cost=sqr_feet*1200;
		}
		if(std_materials=="above"&&automated_home=="No")
		{
			construction_cost=sqr_feet*1500;
		}
		if(std_materials=="high"&&automated_home=="No")
		{
			construction_cost=sqr_feet*1800;
		}
		if(standard_materials=="high"&&automated_home=="Yes")
		{
			construction_cost=sqr_feet*2500;
		}
		return construction_cost;
	}

}
