package com.yousssef.sharity.Base.BaseService;


import com.yousssef.sharity.Base.BaseRepository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
//@RequiredArgsConstructor
public abstract class BaseService<T,ID extends Number> {

    @Autowired
    private  BaseRepository<T,ID> baseRepository;

    public List<T> findAll() {
        return baseRepository.findAll();
    }

    public T save(T t){
        return baseRepository.save(t);
    }

    public void flush() {
        baseRepository.flush();
    }

    public <S extends T> S saveAndFlush(S item) {
        return baseRepository.saveAndFlush(item);
    }

 //   public void deleteInBatch(Iterable<T> params) {
   //     baseRepository.deleteInBatch(params);
    //}

    public void deleteAllInBatch() {
        baseRepository.deleteAllInBatch();
    }

    public T getOne(ID id) {
        return baseRepository.getOne(id);
    }






}
