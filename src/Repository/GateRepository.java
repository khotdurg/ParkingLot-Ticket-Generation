package Repository;

import Model.Gate;

import java.util.Optional;

public interface GateRepository {
    public Optional<Gate> findById(long gateId);
    public Gate save(Gate gate);
}
