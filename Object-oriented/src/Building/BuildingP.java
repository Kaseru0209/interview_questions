package Building;
class Building{
	String materials;
	boolean hasHeating;
	public boolean hasHeating() {
		return false;
	}
}
class BuildingProcess{
	void prepareMaterials(){};
	void layFoundation(){};
	void buildWalls() {};
	void addRoof() {};
	void installHeating() {};
}
class House extends Building {    
	public House() 
	{        
		materials = "wood";        
		hasHeating = true;    
	}     
	public void prepareMaterials() 
	{        
		System.out.println("Preparing wood and other materials for the house.");
	}     
	public void layFoundation() 
	{        
		System.out.println("Laying a concrete foundation for the house.");
	}    
	public void buildWalls()
	{        
		System.out.println("Building wooden walls for the house.");
	} 
	public void addRoof()
	{        
		System.out.println("Adding a shingle roof to the house.");
	}        
	public void installHeating() 
	{        
		System.out.println("Installing radiant floor heating in the house."); 
	}
}
public class BuildingP {
	public static void main(String[] args) {    
		BuildingProcess process = new BuildingProcess();   
		Building house = new House();    
		process.prepareMaterials();    
		process.layFoundation();   
		process.buildWalls();    
		process.addRoof();    
		if (house.hasHeating()) {     
			process.installHeating();    
			}
		}
}

