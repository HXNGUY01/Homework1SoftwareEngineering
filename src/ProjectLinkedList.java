

//setup class ProjectLinkedList which implements the provided interface ILinkedList

public class ProjectLinkedList<T> implements ILinkedList<T> {
    ProjectLinkedList<T> next;
    private T value;

    public ProjectLinkedList(T value) {
        this.value = value;
    }//value constructor


    @Override

    public ProjectLinkedList<T> next() {

        if (this.next == null) {
            return null;
        } else {


            return next;
        }//else
    }//next method

    @Override

    public ProjectLinkedList<T> last() {
        if (this == null) {
            return null;
        }//if
        else {
            ProjectLinkedList<T> temp = this; //Hold current item
            while (temp.next != null) {
                temp = temp.next;
            }//while
            return temp;
        }//else
    }//last


    @Override

    public ProjectLinkedList<T> after(int n) {
        ProjectLinkedList<T> temp = this;
        for (int i = 0; i <= n && temp.next != null;
             i++) {
            temp = temp.next;

        }//for loop
        return temp;
    }

    @Override

    public ProjectLinkedList<T> detach() {
        if (this.next != null) {
            ProjectLinkedList<T> temp = this.next;
            this.next = temp.next;
            return temp;
        } else
            return null;


    }//detach function


    @Override

    public T get() {
        return this.value;

    }//get function

    @Override

    public void set(T value) {
        this.value = value;

    }//set method

    @Override
    public void setNext(ILinkedList<T> next) {
        this.next = (ProjectLinkedList<T>) next;

    }//setNext function

    @Override
    public void append(ILinkedList<T> next) {
        this.last().setNext(next);
    }// append function

    @Override
    public void insert(ILinkedList<T> newFirst) {
        newFirst.setNext(this);
    }// insert function

}//class


