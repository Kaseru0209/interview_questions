package BuildHouse;

//别墅
public class Villa extends TemplateHouse{

  protected void buildBase() {
      System.out.println("别墅：打 5 米深的地基");
  }

  protected void buildWall() {
      System.out.println("别墅：砌 50 厘米厚的砖墙");
  }

  protected void buildRoof() {
      System.out.println("别墅：盖屋顶，哥特式风格的屋顶");
  }

  protected void buildHeating() {
      System.out.println("别墅：建地暖");
  }
}


