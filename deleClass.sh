#!/bin/sh

echo "This command is used to delete *.class file in this floder"
read -p "Are you sure to contuinue?[y/n]" isOk

case $isOk in
	y|Y)
		echo "deleting......"
		find ./ -type f -name "*.class" -print -exec rm {} \;
	;;
	n|N)
		exit
	;;
esac

echo "finish!"
