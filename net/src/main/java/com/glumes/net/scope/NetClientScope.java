package com.glumes.net.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by zhaoying on 2017/8/22.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface NetClientScope {
}
