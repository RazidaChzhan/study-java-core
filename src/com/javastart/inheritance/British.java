package com.javastart.inheritance;

public class British extends Cat{
    private String name;
    public British(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() == obj.getClass()) {
            British outsideObject = (British) obj;
            return name.equals(outsideObject.name)
                    && getAge() == outsideObject.getAge()
                    && getOwner().equals(outsideObject.getOwner());
        }
        return false;
    }
}
