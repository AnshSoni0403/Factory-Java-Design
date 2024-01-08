interface OS {
    void spec();
}

class Android implements OS {
    public void spec() {
        System.out.println("I am an Android phone.");
    }
}

class Windows implements OS {
    public void spec() {
        System.out.println("I am Windows.");
    }
}

class IOS implements OS {
    public void spec() {
        System.out.println("I am iOS.");
    }
}

class OperatingSystemFactory {
    public OS getInstance(String str) {
        if (str.equals("open")) {
            return new Android();
        } else if (str.equals("closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}

public class factory {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();

        
        OS androidOS = osf.getInstance("open");
        androidOS.spec();  // Output: I am an Android phone.

        OS iosOS = osf.getInstance("closed");
        iosOS.spec();  // Output: I am iOS.

        OS windowsOS = osf.getInstance("unknown");
        windowsOS.spec();  // Output: I am Windows.
    }
}
