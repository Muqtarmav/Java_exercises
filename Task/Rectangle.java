package holidayTasks;

public class Rectangle {
    private float length = 1;
    private float width = 1;

    public void setLength(float length){
        if ( length > 0.0 || length < 20.0) {
            this.length = length;
        }

            else{
                throw new IllegalArgumentException("invalid length");
        }
    }

    public float getLength(){
        return length;
    }

    public void setWidth(float width) {
        if (width > 0.0 || width < 20.0) {
            this.width = width;
        }

        else {
            throw new IllegalArgumentException("width is not valid");
        }
    }

    public float getWidth(){
        return width;
    }

    public float getPerimeter(){
        return length + length + width + width;
    }

    public float getArea(){
        return  length * width;
    }




}
