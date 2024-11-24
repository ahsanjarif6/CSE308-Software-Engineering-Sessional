abstract class AbstractDecorator extends Component{
    public Component component;

    public void setComponent(Component c){
        component = c;
    }

    public void makeCoffee(){
        if(component != null){
            component.makeCoffee();
        }
    }

    public abstract int print();
}