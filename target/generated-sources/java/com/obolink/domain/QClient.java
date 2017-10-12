package com.obolink.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClient is a Querydsl query type for Client
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClient extends EntityPathBase<Client> {

    private static final long serialVersionUID = 1831756464L;

    public static final QClient client = new QClient("client");

    public final StringPath id = createString("id");

    public final StringPath password = createString("password");

    public final StringPath token = createString("token");

    public final StringPath username = createString("username");

    public QClient(String variable) {
        super(Client.class, forVariable(variable));
    }

    public QClient(Path<? extends Client> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClient(PathMetadata metadata) {
        super(Client.class, metadata);
    }

}

