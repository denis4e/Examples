package patterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        TeamFactory apiTeam = new FactoryMaker().createFactory("API");
        DevMember devAPI = apiTeam.createDevMember();
        QaMember qaAPI = apiTeam.createQaMember();
        devAPI.writeCode();
        qaAPI.doTests();
        TeamFactory webTeam = new FactoryMaker().createFactory("WEB");
        QaMember qaWEB = webTeam.createQaMember();
        DevMember devWEB = webTeam.createDevMember();
        qaWEB.doTests();
        devWEB.writeCode();
    }
}

interface TeamFactory {
    QaMember createQaMember();

    DevMember createDevMember();
}

interface QaMember {
    void doTests();
}

interface DevMember {
    void writeCode();
}


class ManualQa implements QaMember {

    @Override
    public void doTests() {
        System.out.println("Start manual tests");
    }
}

class AutomationQa implements QaMember {

    @Override
    public void doTests() {
        System.out.println("Start auto tests");
    }
}

class FrontEndDev implements DevMember {

    @Override
    public void writeCode() {
        System.out.println("write frontend");
    }
}

class BackEndDev implements DevMember {

    @Override
    public void writeCode() {
        System.out.println("write backend");
    }
}


class WebProjectFactory implements TeamFactory {
    @Override
    public QaMember createQaMember() {
        return new AutomationQa();
    }

    @Override
    public DevMember createDevMember() {
        return new FrontEndDev();
    }
}


class APIProjectFactory implements TeamFactory {
    @Override
    public QaMember createQaMember() {
        return new ManualQa();
    }

    @Override
    public DevMember createDevMember() {
        return new BackEndDev();
    }

}

class FactoryMaker {
    public TeamFactory createFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("API")) {
            return new APIProjectFactory();

        } else if (factoryType.equalsIgnoreCase("WEB")) {
            return new WebProjectFactory();

        }
        return null;
    }
}


