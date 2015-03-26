// <import resource="classpath:/alfresco/extension/templates/webscripts/zalu/vn/report/lib/lamptt.search.lib.js">
function main()
{
	var mang = search.luceneSearch("ASPECT:\"sys:hidden\"");
	for(i=0;i<mang.length;i++){
		mang[i].removeAspect("sys:hidden");
	}
	
}



main();