Testing your plugin
-------------------

Run `mvn package -Pstart-server`.

This will compile and packge your plugin, then download all the necessary dependencies to run the server which will be started in the folder `server`.


Note: the code will only compile with JDK 1.6 (cause: @Override for interface methods)


For Eclipse Users:
-to run the server from eclipse, create a Maven Run Configuration, set Goal to "package" and Profile to "start-server"
-to submit your own changes to your own github repository, you need to add your ssh key to your $HOME/.ssh folder (github help has further information)
