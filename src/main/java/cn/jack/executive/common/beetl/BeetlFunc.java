package cn.jack.executive.common.beetl;

import java.util.Collection;
import java.util.Map;

import org.beetl.core.Context;
import org.beetl.core.Function;
import org.beetl.core.misc.PrimitiveArrayUtil;

public class BeetlFunc implements Function{

	public Boolean call(Object[] paras, Context ctx)
	{

		if (paras.length == 0)
			return true;
		Object result = paras[0];
		if (result == null)
			return true;
		if (result instanceof String)
		{

			if (((String) result).length() != 0)
			{
				return false;
			}

		}
		else if (result instanceof Collection)
		{
			if (((Collection) result).size() != 0)
			{
				return false;
			}
		}
		else if (result instanceof Map)
		{
			if (((Map) result).size() != 0)
			{
				return false;
			}
		}
		else if (result.getClass().isArray())
		{
			Class ct = result.getClass().getComponentType();
			if (ct.isPrimitive())
			{
				return PrimitiveArrayUtil.getSize(result)==0;
			}
			else
			{
				return ((Object[]) result).length==0;
			}
		}
		else
		{
			return false;
		}

		return true;

	}
	
}
