package BuildHouse;

public abstract class TemplateHouse {
    //模板方法：定义建房子的步骤执行顺序
    public final void buildHose(){
        buyMaterial();
        buildBase();
        buildWall();
        buildRoof();
        //修建地暖
        buildHeating();
    }

    //基本方法：准备原材料
    protected void buyMaterial(){
        System.out.println("准备原材料");
    }

    //基本方法：打地基
    protected abstract void buildBase();

    //基本方法：砌墙
    protected abstract void buildWall();

    //基本方法：盖屋顶
    protected abstract void buildRoof();

    //钩子方法：建地暖
    protected void buildHeating(){
    }
}

