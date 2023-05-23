package BuildHouse;

//普通房子
public class CommonHouse extends TemplateHouse{

  protected void buildBase() {
      System.out.println("普通房子：打 2 米深的地基");
  }

  protected void buildWall() {
      System.out.println("普通房子：砌 30 厘米厚的土墙");
  }

  protected void buildRoof() {
      System.out.println("普通房子：盖屋顶，平顶式屋顶");
  }
}

