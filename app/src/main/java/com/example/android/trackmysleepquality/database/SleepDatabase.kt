/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality.database

import androidx.room.Database
import androidx.room.RoomDatabase

// Create an abstract class called SleepDatabase that extends RoomDatabase

// The @Database annotation requires several arguments, so that Room can build the database.
@Database(
    entities = [SleepNight::class], // Supply the SleepNight as the only item with the list of entities
    version = 1, // Set the version as 1**.** Whenever you change the schema, you'll have to increase the version number
    exportSchema = false // Set exportSchema to false, so as not to keep schema version history backups
)
abstract class SleepDatabase: RoomDatabase() {

}