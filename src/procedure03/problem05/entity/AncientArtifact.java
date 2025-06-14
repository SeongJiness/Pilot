package procedure03.problem05.entity;

public abstract class AncientArtifact {
    private String name;

    public AncientArtifact(String name) {
        setName(name);
    }

    public abstract void describe();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
