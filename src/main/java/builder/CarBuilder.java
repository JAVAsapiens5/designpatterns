package builder;

public interface CarBuilder {

    CarBuilder buildChassis();

    CarBuilder buildBody();

    CarBuilder paint();

    CarBuilder buildInterior();

    Car build();
}
