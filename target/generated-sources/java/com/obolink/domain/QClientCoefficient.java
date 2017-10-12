package com.obolink.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClientCoefficient is a Querydsl query type for ClientCoefficient
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClientCoefficient extends EntityPathBase<ClientCoefficient> {

    private static final long serialVersionUID = 142172261L;

    public static final QClientCoefficient clientCoefficient = new QClientCoefficient("clientCoefficient");

    public final StringPath clientId = createString("clientId");

    public final NumberPath<Double> coefficient = createNumber("coefficient", Double.class);

    public final StringPath id = createString("id");

    public QClientCoefficient(String variable) {
        super(ClientCoefficient.class, forVariable(variable));
    }

    public QClientCoefficient(Path<? extends ClientCoefficient> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClientCoefficient(PathMetadata metadata) {
        super(ClientCoefficient.class, metadata);
    }

}

