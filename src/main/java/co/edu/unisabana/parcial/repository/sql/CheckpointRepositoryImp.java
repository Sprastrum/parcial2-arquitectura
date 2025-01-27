package co.edu.unisabana.parcial.repository.sql;

import co.edu.unisabana.parcial.repository.sql.entity.Checkpoint;
import co.edu.unisabana.parcial.repository.sql.jpa.CheckpointRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CheckpointRepositoryImp implements CheckpointRepository {
    @Override
    public Optional<Checkpoint> findFirstByDriverAndFacilityAndFinalizedIsFalse(String driver, String facility) {
        return Optional.empty();
    }

    @Override
    public List<Checkpoint> findAll() {
        return null;
    }

    @Override
    public List<Checkpoint> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Checkpoint> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Checkpoint> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Checkpoint entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Checkpoint> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Checkpoint> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Checkpoint> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Checkpoint> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Checkpoint> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Checkpoint> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Checkpoint> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Checkpoint getOne(Integer integer) {
        return null;
    }

    @Override
    public Checkpoint getById(Integer integer) {
        return null;
    }

    @Override
    public Checkpoint getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Checkpoint> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Checkpoint> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Checkpoint> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Checkpoint> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Checkpoint> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Checkpoint> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Checkpoint, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
