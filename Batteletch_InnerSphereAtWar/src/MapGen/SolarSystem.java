package MapGen;

class SolarSystem {
  private int id;
  private String name;
  private float x;
  private float y;
  private String faction1;
  private String faction2;
  private String faction3;
  private String faction4;
  private String indType;
  private int factories;
  private String polType;

  public SolarSystem(int id, String name, float x, float y, String faction1, String faction2, String faction3, String faction4, String indType, int factories, String polType) {
    this.id = id;
    this.name = name;
    this.x = x;
    this.y = y;
    this.faction1 = faction1;
    this.faction2 = faction2;
    this.faction3 = faction3;
    this.faction4 = faction4;
    this.indType = indType;
    this.factories = factories;
    this.polType = polType;
  }

  public String toJSON() {
    return "{\"id\":" + id + ",\"name\":\"" + name + "\",\"x\":" + x + ",\"y\":" + y + ",\"faction1\":\"" + faction1 + "\",\"faction2\":\"" + faction2 + "\",\"faction3\":\"" + faction3 + "\",\"faction4\":\"" + faction4 + "\",\"indType\":\"" + indType + "\",\"factories\":" + factories + ",\"polType\":\"" + polType + "\"}";
  }
}