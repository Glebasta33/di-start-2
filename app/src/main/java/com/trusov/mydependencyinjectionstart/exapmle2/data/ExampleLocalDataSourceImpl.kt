package com.trusov.mydependencyinjectionstart.exapmle2.data

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
): ExampleLocalDataSource {

    override fun method() {

    }
}