package com.coveo.nashorn_modules;

import org.openjdk.nashorn.api.scripting.NashornException;

import javax.script.ScriptException;

@FunctionalInterface
public interface RequireFunction {
  Object require(String module) throws ScriptException, NashornException;
}
