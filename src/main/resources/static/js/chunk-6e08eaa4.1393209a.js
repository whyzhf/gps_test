(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-6e08eaa4"],{"5a9e":function(e,t,a){"use strict";var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.isLoading,expression:"isLoading"}],ref:"multipleTable",attrs:{"element-loading-text":"加载中...","element-loading-spinner":"el-icon-loading","element-loading-background":"rgba(220, 237, 255,.8)",data:e.tableData,"tooltip-effect":"dark",border:"","cell-style":e.getCellStyle,"header-cell-style":e.getHeaderStyle},on:{"selection-change":e.handleSelectionChange}},["/manage/taskcenter"===e.$route.path?a("el-table-column",{attrs:{width:"55"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-radio",{staticClass:"radio",attrs:{label:t.$index},nativeOn:{change:function(a){return e.getRadioRow(t.row)}},model:{value:e.radio,callback:function(t){e.radio=t},expression:"radio"}},[e._v(" ")])]}}],null,!1,3510363555)}):e._e(),e.isSelectShow?a("el-table-column",{staticClass:"mulit-select",attrs:{type:"selection",width:"55"}}):e._e(),e._l(e.thList,function(e,t){return a("el-table-column",{key:t,staticStyle:{"font-size":"16px"},attrs:{label:e.ch,prop:e.en}})}),e.isShow?a("el-table-column",{attrs:{label:"状态"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",{class:0==t.row.type?"normal":"destroy",domProps:{textContent:e._s(0==t.row.type?"正常":"故障")}}),0==t.row.type?a("span",{class:1===t.row.status?"normal":"useing",domProps:{textContent:e._s(1==t.row.status?"(未使用)":"(使用中)")}}):e._e()]}}],null,!1,1142099066)}):e._e(),e.isVisible?a("el-table-column",{attrs:{label:"任务状态"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("span",{class:0==t.row.status?"checking":1==t.row.status?"normal":2==t.row.status?"destroy":3==t.row.status?"working":"useing",domProps:{textContent:e._s(0==t.row.status?"审核中":1==t.row.status?"审核通过":2==t.row.status?"审核未通过":3==t.row.status?"执行中":"已完成")}})]}}],null,!1,1272741679)}):e._e(),e.isOperateShow?a("el-table-column",{attrs:{label:"/manage/taskverify"===e.$route.path?"审核":"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("div",{staticClass:"row-operate"},[e._t("operate",null,null,t)],2)]}}],null,!0)}):e._e()],2)],1)},r=[],o=(a("8e6e"),a("456d"),a("ac6a"),a("bd86")),i=a("2f62");function s(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter(function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable})),a.push.apply(a,n)}return a}function c(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?s(a,!0).forEach(function(t){Object(o["a"])(e,t,a[t])}):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):s(a).forEach(function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))})}return e}var u={name:"dataTable",props:{tableData:{type:Array,required:!0},thList:{type:Array,required:!0},isLoading:{type:Boolean}},data:function(){return{isShow:!1,isVisible:!1,isSelectShow:!1,isOperateShow:!1,radio:[]}},mounted:function(){switch(this.$route.path){case"/manage/equipmentmanage":case"/manage/carmanage":this.isShow=!0;break;default:this.isShow=!1;break}switch(this.$route.path){case"/manage/taskmanage":case"/manage/taskcenter":case"/manage/taskverify":case"/manage/currenttask":this.isVisible=!0;break;default:this.isVisible=!1;break}switch(this.$route.path){case"/manage/historytask":case"/manage/taskverify":case"/manage/taskcenter":case"/manage/currenttask":this.isSelectShow=!1;break;default:this.isSelectShow=!0;break}switch(this.$route.path){case"/manage/taskcenter":case"/manage/currenttask":case"/manage/historytask":this.isOperateShow=!1;break;default:this.isOperateShow=!0;break}},methods:c({},Object(i["c"])(["updateMultipleSelection"]),{toggleSelection:function(e){var t=this;e?e.forEach(function(e){t.$refs.multipleTable.toggleRowSelection(e)}):this.$refs.multipleTable.clearSelection()},handleSelectionChange:function(e){this.updateMultipleSelection(e)},getRadioRow:function(e){this.updateMultipleSelection(e)},getCellStyle:function(){return"height:50px;textAlign:center;fontSize:18px;color:rgba(102,102,102,1);fontWeight:400"},getHeaderStyle:function(){return"background:rgba(220,237,255,1);fontWeight:bold;height:50px;textAlign:center;fontSize:18px;color:rgba(102,102,102,1)"}})},l=u,p=(a("7c61"),a("2877")),d=Object(p["a"])(l,n,r,!1,null,null,null);t["a"]=d.exports},"7c61":function(e,t,a){"use strict";var n=a("dca4"),r=a.n(n);r.a},"80cc":function(e,t,a){"use strict";var n=a("b2a2"),r=a.n(n);r.a},b2a2:function(e,t,a){},dca4:function(e,t,a){},e767:function(e,t,a){"use strict";a.r(t);var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"manage-table-wrap"},[a("div",{staticClass:"route-btn-list"},[a("el-button",{attrs:{type:"primary",icon:"el-icon-plus"},on:{click:function(t){return e.$router.push("/manage/addnewroute")}}},[e._v("新增")]),a("el-button",{attrs:{type:"primary",icon:"el-icon-delete"},on:{click:e.deleteSelected}},[e._v("删除")])],1),a("dataTable",{attrs:{tableData:e.tableData,thList:e.thList,isLoading:e.isLoading},scopedSlots:e._u([{key:"operate",fn:function(t){return[a("div",{on:{click:function(a){return e.handleEdit(t.$index,t.row)}}},[e._v("编辑")]),a("div",{on:{click:function(a){return e.handleDelete(t.$index,t.row)}}},[e._v("删除")])]}}])}),a("div",{staticClass:"pagination-wrap"},[a("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:e.routeTotal},on:{"current-change":e.numPage,"prev-click":e.prevpage,"next-click":e.nextpage}})],1)],1)},r=[],o=(a("8e6e"),a("456d"),a("96cf"),a("3b8d")),i=(a("ac6a"),a("bd86")),s=a("2f62"),c=a("5a9e"),u=a("365c");function l(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter(function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable})),a.push.apply(a,n)}return a}function p(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?l(a,!0).forEach(function(t){Object(i["a"])(e,t,a[t])}):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):l(a).forEach(function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))})}return e}var d={name:"RouteManage",components:{dataTable:c["a"]},data:function(){var e=function(e,t,a){var n=/^[A-Za-z0-9\u4E00-\u9FA5]+$/;t||a(new Error("此项不能为空")),n.test(t)?a():a(new Error("必须是字母、数字"))};return{pageNum:1,thList:[{ch:"任务名称",en:"name"},{ch:"距离",en:"distance"},{ch:"创建时间",en:"uptime"}],formTitle:"",routeForm:{name:"",distance:"",uptime:""},rules:{name:{required:!0,trigger:"blur",validator:e},distance:{required:!0,trigger:"blur",validator:e},uptime:{required:!0,trigger:"blur"}}}},computed:p({},Object(s["d"])({areaId:function(e){return e.areaId},tableData:function(e){return e.routeManage.tableData},routeTotal:function(e){return e.routeManage.routeTotal},isLoading:function(e){return e.routeManage.isLoading}})),mounted:function(){var e=this;0===this.areaId?setTimeout(function(){var t=e.areaId;e.getRouteData({areaId:t,pageNum:e.pageNum,pageSize:10})},0):this.getRouteData({areaId:this.areaId,pageNum:this.pageNum,pageSize:10})},methods:p({},Object(s["b"])(["getRouteData","getAddRoute"]),{prevpage:function(e){this.getRouteData({areaId:this.areaId,pageNum:e-1,pageSize:10})},nextpage:function(e){this.getRouteData({areaId:this.areaId,pageNum:e+1,pageSize:10})},numPage:function(e){this.pageNum=e,this.getRouteData({areaId:this.areaId,pageNum:e,pageSize:10})},handleEdit:function(e,t){this.$store.commit("updateEditRoute",t),this.$router.push("/manage/addnewroute")},deleteSelected:function(){var e=this,t=[];this.$store.state.multipleSelection.forEach(function(e){t.push(e.id)});var a=t.join();0!==t.length&&this.$messageBox.confirm("确定要删除么?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",showCancelButton:!0,type:"warning"}).then(Object(o["a"])(regeneratorRuntime.mark(function t(){var n;return regeneratorRuntime.wrap(function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,Object(u["B"])(a);case 2:n=t.sent,n&&(e.$message.success("删除成功"),e.getRouteData({areaId:e.areaId,pageNum:e.pageNum,pageSize:10}));case 4:case"end":return t.stop()}},t)}))).catch(function(){e.$message({type:"info",message:"已取消删除"})})},handleDelete:function(e,t){var a=this,n=t.id;this.$messageBox.confirm("确定要删除么?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",showCancelButton:!0,type:"warning"}).then(Object(o["a"])(regeneratorRuntime.mark(function e(){var t;return regeneratorRuntime.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,Object(u["B"])(n);case 2:t=e.sent,t&&(a.$message.success("删除成功"),a.getRouteData({areaId:a.areaId,pageNum:a.pageNum,pageSize:10}));case 4:case"end":return e.stop()}},e)}))).catch(function(){a.$message({type:"info",message:"已取消删除"})})}})},g=d,h=(a("80cc"),a("2877")),f=Object(h["a"])(g,n,r,!1,null,"7862e2d8",null);t["default"]=f.exports}}]);