package com.trusov.mydependencyinjectionstart.example2.data.datasource

import com.trusov.mydependencyinjectionstart.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
): ExampleLocalDataSource {

    override fun method() {

    }
}