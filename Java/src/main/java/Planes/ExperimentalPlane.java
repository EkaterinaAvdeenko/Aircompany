package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

  private final ExperimentalTypes experimentalType;
  private ClassificationLevel classificationLevel;

  public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
      ExperimentalTypes experimentalType, ClassificationLevel classificationLevel) {
    super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    this.experimentalType = experimentalType;
    this.classificationLevel = classificationLevel;
  }

  public ClassificationLevel getClassificationLevel() {

    return classificationLevel;
  }

  public void setClassificationLevel(ClassificationLevel classificationLevel) {
    this.classificationLevel = classificationLevel;
  }

}
