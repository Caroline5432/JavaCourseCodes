package com.github.caroline.homework08.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author
 */
@Entity
@Table(name = "transaction_info")
@Data
public class TransactionInfo implements Serializable {

    @Id @GeneratedValue
    Long id;
    String xid;
    int status;
    String className;
    String commitMethodName;
    String cancelMethodName;

    public TransactionInfo() {}
}
