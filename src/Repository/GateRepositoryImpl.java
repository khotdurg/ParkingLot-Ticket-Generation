package Repository;

import Model.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Implementation of GateRepository interface for managing gates
public class GateRepositoryImpl implements GateRepository{
    // Map to store gates with their IDs as keys
    private final Map<Long, Gate> gates = new HashMap<>();

    // Retrieve a gate by its ID
    @Override
    public Optional<Gate> findById(long gateId) {
        return Optional.ofNullable(gates.get(gateId));
    }

    // Save a gate to the repository
    @Override
    public Gate save(Gate gate) {
        gates.put(gate.getId(), gate);
        return gate;
    }
}
