<html>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.ztree.core.js"/>
<link rel="stylesheet" href="css/zTreeStyle.css">

<script type="text/javascript">
    var zTree;
    var setting = {
        isSimpleData : true, //数据是否采用简单Array格式，默认是false；
        treeNodeKey : "id", //在isSimpleData格式下，当前节点id属性
        treeNodeParentKey : "pId", //在isSimpleData格式下，当前节点的父节点id属性
        showLine : true, //是否显示节点间的连线
        checkable : true, //每个节点上是否显示CheckBox
        callback : {
            onClick : leftClick //单击
        }
    };
    var tree = ${departmentTree}; //后台传递的sontree

    zTree = $.fn.zTree.init($("#treeDemo"),setting,tree,departmentTree);
</script>
<title>jquery_core</title>
<body>
<h2>Hello World!</h2>
<div id="tree">
    <ul id="treeDemo" class="ztree"></ul>
</div>
</body>
</html>
