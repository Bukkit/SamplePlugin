Testing your plugin
-------------------

Run `mvn package -Pstart-server`.

This will compile and packge your plugin, then download all the necessary dependencies to run the server which will be started in the folder `server`.


Note: the code will only compile with JDK 1.6 (cause: @Override for interface methods)
