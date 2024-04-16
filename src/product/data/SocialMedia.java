package product.data;

public class SocialMedia {
    private String name;

    final void setName(String name){
        this.name = name;
    }

    final String getName() {
        return name;
    }
}

final class Facebook extends SocialMedia {
    // CANNOT OVERRIDE FINAL METHOD
//    public void setName(String name){
//        this.name = "Facebook: " + name;
//    }
}

// CANNOT INHERIT FINAL CLASS
//class FakeFacebook extends Facebook {
//
//}
